/*******************************************************************************************************
 *
 * NewFileWizardPage.java, in gama.ui.diagram.graphicalmodeling, is part of the source code of the GAMA modeling and
 * simulation platform (v.1.9.3).
 *
 * (c) 2007-2024 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama for license information and contacts.
 *
 ********************************************************************************************************/
package gama.ui.diagram.swt.wizards;

import java.net.InetAddress;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

import gama.ui.navigator.view.contents.WrappedFolder;
import gama.ui.navigator.view.contents.WrappedProject;

/**
 * The "New" wizard page allows setting the container for the new file as well as the file name. The page will only
 * accept file name without the extension OR with the extension that matches the expected one.
 */

public class NewFileWizardPage extends WizardPage {

	/** The container text. */
	private Text containerText;

	/** The file text. */
	private Text fileText;

	/** The author text. */
	private Text authorText;

	/** The description text. */
	private Text descriptionText;

	/** The title text. */
	private Text titleText;

	/** The empty model button. */
	private Button emptyModelButton;

	/** The skeleton model button. */
	private Button skeletonModelButton;

	/** The type of model. */
	private String typeOfModel = "empty";

	/** The selection. */
	private final ISelection selection;

	/**
	 * Instantiates a new new file wizard page.
	 *
	 * @param selection
	 *            the selection
	 */
	public NewFileWizardPage(final ISelection selection) {
		super("wizardPage");
		setTitle("Model Diagram");
		setDescription("This wizard creates a new model file.");
		this.selection = selection;
	}

	@Override
	public void createControl(final Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		Label label = new Label(container, SWT.NULL);
		label.setText("&Container:");

		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(e -> dialogChanged());

		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				handleBrowse();
			}
		});

		label = new Label(container, SWT.NULL);
		label.setText("&Choose a diagram:");

		Composite middleComposite = new Composite(container, SWT.NULL);
		FillLayout fillLayout = new FillLayout();
		middleComposite.setLayout(fillLayout);

		emptyModelButton = new Button(middleComposite, SWT.RADIO);
		emptyModelButton.setText("Empty");
		emptyModelButton.setSelection(true);
		skeletonModelButton = new Button(middleComposite, SWT.RADIO);
		skeletonModelButton.setText("Skeleton");
		emptyModelButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent se) {
				typeOfModel = "empty";
				radioChanged();
			}

		});
		skeletonModelButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent se) {
				typeOfModel = "skeleton";
				radioChanged();
			}
		});

		/* Need to add empty label so the next controls are pushed to the next line in the grid. */
		label = new Label(container, SWT.NULL);
		label.setText("");

		label = new Label(container, SWT.NULL);
		label.setText("&File name:");

		fileText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(e -> {
			Text t = (Text) e.getSource();
			String fname = t.getText();
			int i = fname.lastIndexOf(".gadl");
			if (i > 0) {
				// model title = filename less extension less all non alphanumeric characters
				titleText.setText(fname.substring(0, i).replaceAll("[^\\p{Alnum}]", ""));
			} /*
				 * else if (fname.length()>0) { int pos = t.getSelection().x; fname =
				 * fname.replaceAll("[[^\\p{Alnum}]&&[^_-]&&[^\\x2E]]", "_"); t.setText(fname+".gaml");
				 * t.setSelection(pos); } else { t.setText("new.gaml"); }
				 */
			dialogChanged();
		});

		/* Need to add empty label so the next two controls are pushed to the next line in the grid. */
		label = new Label(container, SWT.NULL);
		label.setText("");

		label = new Label(container, SWT.NULL);
		label.setText("&Author:");

		authorText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		authorText.setLayoutData(gd);
		authorText.setText(getComputerFullName());
		authorText.addModifyListener(e -> dialogChanged());

		/* Need to add empty label so the next two controls are pushed to the next line in the grid. */
		label = new Label(container, SWT.NULL);
		label.setText("");

		label = new Label(container, SWT.NULL);
		label.setText("&Diagram name:");

		titleText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		titleText.setLayoutData(gd);
		titleText.setText("new");
		titleText.addModifyListener(e -> dialogChanged());

		/* Need to add empty label so the next two controls are pushed to the next line in the grid. */
		label = new Label(container, SWT.NULL);
		label.setText("");

		label = new Label(container, SWT.NULL);
		label.setText("&Model description:");

		descriptionText = new Text(container, SWT.WRAP | SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		descriptionText.setBounds(0, 0, 250, 100);
		gd = new GridData(SWT.FILL, SWT.FILL, true, false);
		gd.verticalSpan = 4;
		descriptionText.setLayoutData(gd);

		/*
		 * Need to add seven empty labels in order to push next controls after the descriptionText box.
		 */
		// TODO Dirty!! Change the way to do this
		for (int i = 0; i < 7; i++) {
			label = new Label(container, SWT.NULL);
			label.setText("");
		}

		/* Finished adding the custom control */
		initialize();
		dialogChanged();
		setControl(container);
	}

	/**
	 * Return the computer full name. <br>
	 *
	 * @return the name or <b>null</b> if the name cannot be found
	 */
	public static String getComputerFullName() {
		String uname = System.getProperty("user.name");
		if (uname == null || uname.isEmpty()) {
			try {
				final InetAddress addr = InetAddress.getLocalHost();
				uname = new String(addr.getHostName());
			} catch (final Exception e) {}
		}
		return uname;
	}

	/**
	 * Radio changed.
	 */
	private void radioChanged() {
		if (emptyModelButton.getSelection() || skeletonModelButton.getSelection()) {
			descriptionText.setText("");
			titleText.setText("new");
			fileText.setText("new.gadl");
			updateStatus(null);
		}
		dialogChanged();
	}

	/** Tests if the current workbench selection is a suitable container to use. */
	private void initialize() {
		if (selection != null && !selection.isEmpty() && selection instanceof IStructuredSelection ssel) {
			if (ssel.size() > 1) return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof WrappedProject) {
				WrappedProject pro = (WrappedProject) obj;
				IProject container = pro.getResource();
				if (container != null && container.getFullPath() != null) {
					String path = container.getFullPath().toString();
					if ("".equals(path) || "/".equals(path)) {
						IContainer res = container.getParent();
						if (res != null && res.getFullPath() != null) {
							path = res.getFullPath().toString();
							while ("".equals(path)) {
								res = res.getParent();
								if (res == null || res.getFullPath() == null) { break; }
								path = res.getFullPath().toString();
							}

						}
					}
					containerText.setText(path);
				}

			} else if (obj instanceof WrappedFolder) {
				WrappedFolder pro = (WrappedFolder) obj;
				IFolder container = pro.getResource();
				if (container != null && container.getFullPath() != null) {
					String path = container.getFullPath().toString();
					IContainer res = container.getParent();

					if (res != null && res.getFullPath() != null) {
						path = res.getFullPath().toString();
						while ("".equals(path)) {
							res = res.getParent();
							if (res == null || res.getFullPath() == null) { break; }
							path = res.getFullPath().toString();
						}

					}

					containerText.setText(path);
				}

			}
		}
		fileText.setText("new.gadl");
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for the container field.
	 */
	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(),
				ResourcesPlugin.getWorkspace().getRoot(), false, "Select a project as a container");
		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) { containerText.setText(((Path) result[0]).toString()); }
		}
	}

	/** Ensures that controls are correctly set. */
	private void dialogChanged() {
		IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getContainerName()));
		IContainer container = (IContainer) resource;
		String fileName = getFileName();
		String author = getAuthor();
		String titleName = getModelName();
		final IFile modelfile = container.getFile(new Path("diagrams/" + fileName));

		if (getContainerName().length() == 0) {
			updateStatus("File container must be specified");
			return;
		}
		if (resource == null || (resource.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!resource.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}
		if (fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		if (!fileName.endsWith(".gadl")) {
			updateStatus("File extension must be \".gadl\"");
			return;
		}
		if (author.length() == 0) {
			updateStatus("Author name must be specified");
			return;
		}
		if (modelfile.exists()) {
			updateStatus("File already exists");
			return;
		}

		if (titleName.length() == 0) {
			updateStatus("Diagram name must be specified");
			return;
		}
		updateStatus(null);
	}

	/**
	 * Update status.
	 *
	 * @param message
	 *            the message
	 */
	private void updateStatus(final String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	/** Gets the container name of the new file */
	public String getContainerName() {
		// TODO user has to select a project otherwise it doesn't work
		return containerText.getText();
	}

	/** Gets the file name of the new file */
	public String getFileName() { return fileText.getText(); }

	/** Gets the author of the new file */
	public String getAuthor() { return authorText.getText(); }

	/** Gets the model name of the new file */
	public String getModelName() { return titleText.getText(); }

	/** Gets the model name of the new file */
	@Override
	public String getDescription() { return descriptionText.getText(); }

	/** Return the type of model (empty, skeleton or example) */
	public String getTypeOfModel() {
		return typeOfModel;

	}
}