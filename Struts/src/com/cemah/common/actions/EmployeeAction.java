package com.cemah.common.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.cemah.common.forms.EmployeeForm;

public class EmployeeAction extends Action
{

	public ActionForward execute(ActionMapping mapping,ActionForm form,
			HttpServletRequest request,HttpServletResponse response) throws Exception
	{
		EmployeeForm employeeform = (EmployeeForm) form;
		
		return mapping.findForward("success");
	}
}
