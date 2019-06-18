public class StdList {
	private Node h;

	public StdList() {
		h = new Node();
		h.data = null;
		h.next = null;
	}

	public boolean insertStd(Student std) {
		Node n = new Node();
		n.data = std;
		n.next = h.next;
		h.next = n;
		return true;
	}

	public boolean haveRollno(String rollno) {
		Node a = h.next;
		boolean have = false;
		while (a != null) {
			if (rollno.equals(a.data.getRollno())) {
				have = true;
				break;
			}
			a = a.next;
		}
		return have;
	}

	public Student fetchData(String rollno) {
		Student data = null;
		Node a = h.next;
		while (a != null) {
			if (a.data.getRollno().equals(rollno)) {
				data = a.data;
				break;
			}
			a = a.next;
		}
		
		return data;
	}

	public void deleteStudent(String rollno) {
		Node a = h;
		Node b = h.next;
		while (b != null && !(b.data.getRollno().equals(rollno))) {
			a = b;
			b = b.next;
		}
		if(b != null){
			a.next = b.next;
		}
		else{
			////
		}
	}
	
	public void showAll(){
		Node x = h.next;
		while(x!=null){
			System.out.println(x.data);
			x = x.next;
		}
	}

	class Node {
		private Student data;
		private Node next;
	}

}
