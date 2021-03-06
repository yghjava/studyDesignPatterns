package chapter20_day01.demo1;

public class Project implements IProject {

	/**
	 * the name of project
	 */
	private String name = "";

	/**
	 * The member of project
	 */
	private int num = 0;

	/**
	 * The cost of project
	 */
	private int cost = 0;

	public Project(String name, int num, int cost) {
		super();
		this.name = name;
		this.num = num;
		this.cost = cost;
	}

	@Override
	public String getProjectInfo() {
		StringBuilder sb = new StringBuilder();
		sb.append("项目名称是：").append(this.name);
		sb.append("\t项目人数：").append(this.num);
		sb.append("\t项目费用：").append(this.cost);
		return sb.toString();
	}

}
