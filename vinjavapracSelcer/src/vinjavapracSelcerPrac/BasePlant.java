package vinjavapracSelcerPrac;

public class BasePlant {

	private String name;
	public BasePlant(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

}
class Tree extends BasePlant{

 public Tree(){
	super("Plant");
	//public BasePlant(){Tree();
}

 public void growFruit(){}
 public void dropLeaves(){}
 
}