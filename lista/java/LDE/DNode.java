
public class DNode {
	private Object element;
	private DNode next;
	private DNode prev;

	public DNode(Object element, DNode prev, DNode next) {
		this.element = element;
		this.next = next;
		this.prev = prev;
	}
	public Object getElement() {
		return element;
	}
	public void setElement(Object element) {
		this.element = element;
	}
	public DNode getNext() {
		return next;
	}
	public void setNext(DNode next) {
		this.next = next;
	}
	public DNode getPrev() {
		return prev;
	}
	public void setPrev(DNode prev) {
		this.prev = prev;
	}
	

}
