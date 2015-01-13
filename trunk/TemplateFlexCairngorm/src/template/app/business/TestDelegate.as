package template.app.business
{
	import com.adobe.cairngorm.business.ServiceLocator;
	
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	import mx.utils.object_proxy;
	
	import template.app.model.ModelLocator;

	public class TestDelegate
	{
		private var responder:IResponder;
		private var service:Object;
		public function TestDelegate(responder:IResponder)
		{
			this.responder = responder;
			this.service = ServiceLocator.getInstance().getRemoteObject("pnsService");			
		}
		public function test():void{
			var model:ModelLocator = ModelLocator.getInstance();
			model.testVar = "hasil dari delegate";
			var data:Object = this.service.getHello("Roberto Fernandez");
			data.addResponder(responder);
			
		}
	}
}