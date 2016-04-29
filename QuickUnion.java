
public class QuickUnion {
	private int[] ids,sz;
	
	public QuickUnion(int N ){
		ids = new int[N];
		sz = new int[N];
		for(int i = 0; i < N; i++){
			ids[i] = i; 
			sz[i] = 1;
		}
	}
	
	private int root(int q){
		while (q != ids[q]) q = ids[ids[q]];
		return q;
	}
	
	public void union(int p, int q){
		int i = root(p);
		int j = root(q);
		if(i == j) return;
		if(sz[i] < sz[j]){
			ids[i] =j;
			sz[j] += sz[i];
		} else {
			ids[j] = i;
			sz[i] += sz[j];
		}
	}
	
	public boolean isConnected(int p, int q){
		return root(p) == root(q);
	}
}
