package idees.gama.features.layout;

import org.eclipse.elk.alg.graphiti.GraphElementIndicator;

import com.google.inject.AbstractModule;

public class GamaGraphIndicatorModuleGuice extends AbstractModule{

	@Override
	protected void configure() {
		bind(GraphElementIndicator.class).to(GamaGraphElementIndicator.class);
		
	}

}
