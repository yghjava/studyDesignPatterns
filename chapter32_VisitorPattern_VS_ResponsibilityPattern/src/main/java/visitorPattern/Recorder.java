package visitorPattern;
/**
 * The recorder for DNS
 * @author ygh
 * Aug 1, 2017
 */
public class Recorder {
	private String domain;
	
	private String ip;
	
	private String owner;

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Recorder [domain=" + domain + ", ip=" + ip + ", owner=" + owner + "]";
	}
	
	
	
	
}
