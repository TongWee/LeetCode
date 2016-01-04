package array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new ArrayList<>();
		if (numRows == 0)
			return list;
		List<Integer> row = new ArrayList<>();
		row.add(1);
		list.add(row);
		for (int i = 1; i < numRows; i++) {
			List<Integer> r = new ArrayList<>();
			r.add(1);
			List<Integer> p = new ArrayList<>();
			p = list.get(i - 1);
			for (int j = 0; j < p.size() - 1; j++) {
				r.add(p.get(j) + p.get(j + 1));
			}
			r.add(1);
			list.add(r);
		}
		return list;
	}

	public static void main(String[] args) {
		List<List<Integer>> list = generate(10);
		for (int i = 0; i < list.size(); i++) {
			List<Integer> l = list.get(i);
			for (int j = 0; j < l.size(); j++) {
				System.out.print(l.get(j) + " ");
			}
			System.out.println();
		}
	}
}
