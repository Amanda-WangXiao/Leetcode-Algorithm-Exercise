class Solution {	//	3 ms	39.8 MB
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i=0;i<n;i++){
			nums1[i+m]=nums2[i];
		}
		Arrays.sort(nums1);
		System.out.println(Arrays.toString(nums1));
	}
}

class Solution {	//	2 ms	40.1 MB
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] nums1_copy=new int[m];
		System.arraycopy(nums1,0,nums1_copy,0,m);
		int p=0,q=0;
		int i=0;
		while((p<m)&&(q<n)){
			if(nums1_copy[p]<=nums2[q]){
				nums1[i]=nums1_copy[p];
				p++;
				i++;
			}
			else{
				nums1[i]=nums2[q];
				q++;
				i++;
			}
		}

		if(p==m) System.arraycopy(nums2,q,nums1,i,n-q);
		if(q==n) System.arraycopy(nums1_copy,p,nums1,i,m-p);
		System.out.println(Arrays.toString(nums1));
	}
}