package Repository;

import java.util.ArrayList;
import java.util.List;

import Database.EntryObject;

public class EntryTranslator {
	private Method method;
	private EntryObject entryObject;
	
	
	//for generating new name only
	private String fileName;
	private int count;
	
	public EntryTranslator(Method method) {
		super();
		this.method = method;
		this.entryObject = new EntryObject();
		this.count = 0;
		this.fileName = method.getName();
		
		initEntryObject();
		
		
	}
	
	
	
	
	private void initEntryObject() {
		translateWithSSA();
		
	}




	private void translateWithSSA() {
		for(String path : method.getPath()){
			PathTranslator pathTranslator = new PathTranslator(path, method.getPathToInput().get(path));
			List<String> constraints = new ArrayList<String>();
			StringBuilder constraintString = new StringBuilder();
			for(String line : constraints){
				constraintString.append(line);
				constraintString.append("\n");
			}
			this.entryObject.getPathConstraint().put(path, constraintString.toString());
			this.entryObject.getPathVariableMap().put(path, pathTranslator.getVariableMap());
			this.entryObject.getPathVariableTrack().put(path, pathTranslator.getVariableTrack());
			this.entryObject.getPathVariablesTypes().put(path, pathTranslator.getVariableType());
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
