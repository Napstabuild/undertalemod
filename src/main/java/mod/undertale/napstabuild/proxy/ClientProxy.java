package mod.undertale.napstabuild.proxy;

import mod.undertale.napstabuild.init.itemsU;

public class ClientProxy extends CommonProxy {
	
	@Override
    public void registerRenders()
    {
		itemsU.registerRenders();
    }
}
