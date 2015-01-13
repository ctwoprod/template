package template.app.controller
{
	import com.adobe.cairngorm.control.FrontController;
	
	import template.app.command.TestCommand;
	import template.app.event.TestEvent;
	
	public class MainController extends FrontController
	{
		public function MainController()
		{
			super();
			addCommand(TestEvent.TEST_EVENT, TestCommand);
		}
	}
}