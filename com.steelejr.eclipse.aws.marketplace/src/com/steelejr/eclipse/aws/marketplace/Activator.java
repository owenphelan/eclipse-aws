package com.steelejr.eclipse.aws.marketplace;

import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "com.steelejr.eclipse.aws.marketplace"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}
	
	
	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		super.initializeImageRegistry(reg);
		
		Image img = Activator.imageDescriptorFromPlugin(PLUGIN_ID, "icons/wizban/install_wiz.gif").createImage();
		reg.put("new_feature", img);
		
		img = Activator.imageDescriptorFromPlugin(PLUGIN_ID, "icons/common/refresh.gif").createImage();
		reg.put ("refresh", img);
		
		img = Activator.imageDescriptorFromPlugin(PLUGIN_ID, "icons/features/new_updateSite.gif").createImage();
		reg.put ("new_updateSite", img);
	}

}
