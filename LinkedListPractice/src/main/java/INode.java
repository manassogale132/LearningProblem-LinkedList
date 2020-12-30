
public interface INode<K> {

	K getKey();
	void serKey(K key);
	
	INode getNext();
	void setNext(INode next);
	
}
