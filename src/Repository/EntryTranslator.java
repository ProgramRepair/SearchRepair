package Repository;

import java.util.List;
import java.util.Map;

import Database.DataHandler;
import Database.EntryObject;

public class EntryTranslator {
	private Method method;
	private EntryObject entryObject;
	
	
	
	public EntryTranslator(Method method) {
		super();
		this.method = method;
		this.entryObject = new EntryObject();
		
		initEntryObject();
		
		
	}
	
	
	
	
	private void initEntryObject() {
		translateWithSSA();
		
	}




	private void translateWithSSA() {
		for(String path : method.getPath()){
			PathTranslator pathTranslator = new PathTranslator(path, method.getPathToInput().get(path));
			List<String> constraints = pathTranslator.getSsa();
			StringBuilder constraintString = new StringBuilder();
			for(String line : constraints){
				constraintString.append(line);
				constraintString.append("\n");
			}
			
			System.out.println(constraintString.toString());
			this.entryObject.getPathConstraint().put(path, constraintString.toString());
			
			Map<String, String> mapping = pathTranslator.getVariableMap();
			StringBuilder mappingString = new StringBuilder();
			for(String var : mapping.keySet()){
				String one = DataHandler.concat(var, mapping.get(var));
				mappingString.append(one);
			}
			
			this.entryObject.getPathVariableMap().put(path, mapping.toString());
			
			
			Map<String, String> tracks = pathTranslator.getVariableTrack();
			StringBuilder trackString = new StringBuilder();
			for(String var : tracks.keySet()){
				String one = DataHandler.concat(var, tracks.get(var));
				trackString.append(one);
			}
			
			
			this.entryObject.getPathVariableTrack().put(path, trackString.toString());
			
			
			Map<String, String> types = pathTranslator.getVariableType();
			StringBuilder typeString = new StringBuilder();
			for(String var : types.keySet()){
				String one = DataHandler.concat(var, types.get(var));
				typeString.append(one);
			}			
			
			
			this.entryObject.getPathVariablesTypes().put(path, typeString.toString());
		}

		
		
	}




	public Method getMethod() {
		return method;
	}
	public void setMethod(Method method) {
		this.method = method;
	}
	public EntryObject getEntryObject() {
		return entryObject;
	}
	public void setEntryObject(EntryObject entryObject) {
		this.entryObject = entryObject;
	}
	
	
	
	
	
	
}
