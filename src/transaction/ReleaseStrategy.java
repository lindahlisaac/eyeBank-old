package transaction;

import java.util.List;

public class ReleaseStrategy {
	public boolean canRelease(List<String> lines) {
		if(lines.size() > 10) {
			return true;
		}
		
		return false;
	}
}
