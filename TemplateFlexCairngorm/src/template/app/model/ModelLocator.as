package template.app.model
{
	import com.adobe.cairngorm.model.IModelLocator;
	
	[Bindable]
	public class ModelLocator implements IModelLocator
	{
		private static var instance:ModelLocator = null;
		public function ModelLocator()
		{
			if(instance != null){
				throw new Error("Error");
			}
		}
		public static function getInstance(): ModelLocator{
			if(instance == null){
				instance = new ModelLocator();
			}
			return instance;
		}
		public var testVar:String;
	}
}