package vn.nvanhuong.jsf_myfaces;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.PostAddToViewEvent;
import javax.faces.event.PreRenderViewEvent;

@ManagedBean(name = "guiHanlder")
public class GuiManipulatingHandler {
	private List<UIComponent> uiComponents;
	
	public void onScanView(PostAddToViewEvent event) {
		UIComponent rootView = event.getComponent();
		uiComponents = rootView.getChildren();
	}

	public void onManipulateView(PreRenderViewEvent event) {
		for (UIComponent uiComponent : uiComponents) {
			if(uiComponent instanceof HtmlOutputText){
				((HtmlOutputText) uiComponent).setValue("Hello");
			}
			if(uiComponent instanceof HtmlInputText){
				((HtmlInputText) uiComponent).setMaxlength(100);
				((HtmlInputText) uiComponent).setValue("JSF system events");
			}
		}
	}
}
