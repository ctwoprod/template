package template.app.event
{
	import com.adobe.cairngorm.control.CairngormEvent;
	
	public class TestEvent extends CairngormEvent
	{
		public static var TEST_EVENT:String="TEST_EVENT";
		public function TestEvent()
		{
			super(TEST_EVENT);
		}
	}
}