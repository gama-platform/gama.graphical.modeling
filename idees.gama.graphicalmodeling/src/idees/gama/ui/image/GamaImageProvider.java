package idees.gama.ui.image;

import org.eclipse.graphiti.ui.platform.AbstractImageProvider;

public class GamaImageProvider extends AbstractImageProvider {
 
    // The prefix for all identifiers of this image provider
    protected static final String PREFIX = 
              "idees.gama.";
 
    public static final String IMG_SUBSPECIESLINK= PREFIX + "subspecieslink";
    public static final String IMG_SUBGRIDLINK= PREFIX + "subgridlink";
    public static final String IMG_ACTIONLINK= PREFIX + "actionlink";
    public static final String IMG_ASPECTLINK= PREFIX + "aspectlink";
    public static final String IMG_REFLEXLINK= PREFIX + "reflexlink";
    public static final String IMG_GUIXPLINK= PREFIX + "guixplink";
    public static final String IMG_BATCHXPLINK= PREFIX + "batchxplink";
    public static final String IMG_DISPLAYLINK= PREFIX + "displaylink";
    public static final String IMG_INHERITINGLINK= PREFIX + "inheritinglink";
    public static final String IMG_EQUATION= PREFIX + "equationlink";
    public static final String IMG_PERCEIPT= PREFIX + "perceiptlink";
 
    
    @Override
    protected void addAvailableImages() {
        // register the path for each image identifier
        addImageFilePath(IMG_SUBSPECIESLINK, "icons/_species.png");
        addImageFilePath(IMG_SUBGRIDLINK, "icons/_grid.png");
        addImageFilePath(IMG_ACTIONLINK, "icons/_action.png");
        addImageFilePath(IMG_ASPECTLINK, "icons/_aspect.png");
        addImageFilePath(IMG_REFLEXLINK, "icons/_reflex.png");
        addImageFilePath(IMG_GUIXPLINK, "icons/_gui.png");
        addImageFilePath(IMG_BATCHXPLINK, "icons/_batch.png");
        addImageFilePath(IMG_DISPLAYLINK, "icons/_output.png");
        addImageFilePath(IMG_INHERITINGLINK, "icons/inheritinglink.png");
        addImageFilePath(IMG_EQUATION, "icons/_equation.png");
        addImageFilePath(IMG_PERCEIPT, "icons/_perceipt.png");
    }
}