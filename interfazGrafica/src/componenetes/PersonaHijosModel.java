package componenetes;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class PersonaHijosModel implements TreeModel {

	PersonaHijosModel raiz;
	
	
	/*public PersonaHijosModel(PersonaHijos raiz){
		this.raiz= raiz;
	}*/
	
	

	
	@Override
	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getChild(Object parent, int index) {
		// TODO Auto-generated method stub
		PersonaHijos nodo = (PersonaHijos)parent;
		return nodo.getHijo(index);
	}

	@Override
	public int getChildCount(Object parent) {
		// TODO Auto-generated method stub
		return ((PersonaHijos)parent).numHijos();
	}

	@Override
	public int getIndexOfChild(Object parent, Object child) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object getRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLeaf(Object node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub
		
	}

}
