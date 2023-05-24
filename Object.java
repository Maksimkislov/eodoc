package expression;

public class Object extends Expression {
    String object;
    
    public Object(String object) {
    	this.object = object;
    }
    
    @Override
    public String toString() {
    	return object;
    }
}
