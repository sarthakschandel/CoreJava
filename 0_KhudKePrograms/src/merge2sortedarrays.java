import java.util.*;

class merge2sortedarrays {
	public void merge(int[] nums1, int m, int[] nums2, int n) {

		List<Integer> arr1 = new ArrayList<Integer>(m + n);
		List<Integer> arr2 = new ArrayList<Integer>(n);

		for (int i = 0; i < m + n; i++) {
			arr1.add(nums1[i]);
		}

		for (int i = 0; i < n; i++) {
			arr2.add(nums2[i]);
		}

		Collections.reverse(arr1);

		Iterator<Integer> itr = arr1.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 0) {
				itr.remove();
			} else {
				break;
			}
		}

		arr1.addAll(arr2);
		Collections.sort(arr1);

		for (int i = 0; i < arr1.size(); i++) {
			nums1[i] = arr1.get(i);
		}

	}
}