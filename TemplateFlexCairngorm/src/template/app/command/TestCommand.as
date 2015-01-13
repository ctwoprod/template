package template.app.command
{
	import com.adobe.cairngorm.commands.ICommand;
	import com.adobe.cairngorm.control.CairngormEvent;
	
	import mx.controls.Alert;
	import mx.rpc.IResponder;
	
	import template.app.business.TestDelegate;
	
	public class TestCommand implements ICommand, IResponder
	{
		public function TestCommand()
		{
		}
		
		public function execute(event:CairngormEvent):void
		{
			//call delegate
			var testDelegate:TestDelegate = new TestDelegate(this);
			testDelegate.test();
		}
		
		public function result(data:Object):void
		{
			Alert.show("command = "+data.result);
		}
		public function fault(event:Object):void
		{
		
		}
	}
}