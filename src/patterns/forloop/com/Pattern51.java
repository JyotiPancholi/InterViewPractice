package patterns.forloop.com;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Pattern51 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j+" ");
			}
			for (int k = 5; k>i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
