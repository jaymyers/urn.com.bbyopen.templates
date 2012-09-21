package com.bbyopen.templates;

import java.util.List;

import org.netkernel.layer0.nkf.INKFRequestContext;
import org.netkernel.module.standard.endpoint.StandardAccessorImpl;

public class TemplateMapper extends StandardAccessorImpl{

	public TemplateMapper(){
		this.declareThreadSafe();
	}
	
	@Override
	public void onSource(INKFRequestContext context) throws Exception{
		String domain = context.getThisRequest().getArgumentValue("domain");
		//Boolean type = context.getThisRequest().argumentExists("singledomain");
		List<String> shalbs = context.getThisRequest().getArgumentValues("methods");
		context.createResponseFrom(domain);
	}
		
}
