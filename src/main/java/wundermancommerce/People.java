package wundermancommerce;

import java.util.ArrayList;
import java.util.List;

public class People {
	
	private String name;
	private String email;
	private int age;
	boolean visited = false;
	private List<Relatives> relations = new ArrayList<Relatives>();
	
	public People(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	
	
	
	public int getRelationShipCount(){
		return this.relations.size();
	}

	
	public void addRelationShip(People people, String relationShip) {
        if (this.getRelationShipCount() > 0) {
            this.getRelations().forEach(rel -> {
                // if user already in the relationship list then don't add the user in the
                // relations
                if (rel.getPerson().getEmail().equals(people.getEmail())) {
                    return;
                }
            });
        }
        Relatives newRelationShip = new Relatives(Relation.valueOf(relationShip), people);
        this.relations.add(newRelationShip);
        // Relation is bi-directional so add this to the relation of person
        newRelationShip = new Relatives(Relation.valueOf(relationShip), this);
        people.getRelations().add(newRelationShip);
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public boolean isVisited() {
		return visited;
	}


	public void setVisited(boolean visited) {
		this.visited = visited;
	}


	public List<Relatives> getRelations() {
		return relations;
	}


	public void setRelations(List<Relatives> relations) {
		this.relations = relations;
	}


	@Override
	public String toString() {
		return "People [name=" + name + ", email=" + email + ", age=" + age + ", visited=" + visited + ", relations="
				+ relations + "]";
	}
	
	
	
	

	
	
	
	
	
	
	
	/*public static void main(String[] args) {

		String path1 = "C:/Users/NIKHIL/Documents/ServletsPractice/Assignmnet/src/main/resources/people.csv";
		String path2 = "C:/Users/NIKHIL/Documents/ServletsPractice/Assignmnet/src/main/resources/relationships.csv";
		validatePeople(path1);
		try {
			BufferedReader buffer = new BufferedReader(new FileReader(path1));
			String readLine = "";
			List<String> list1 = new ArrayList<String>();
			List<String> list2 = new ArrayList<String>();
			HashMap<String, String> list = new HashMap<>();
			while((readLine = buffer.readLine())!=null)
			{
				System.out.println(readLine);
				String [] values = readLine.split(",");
				list.put(values[0], values[1]);
				System.out.println(list);
				int i =0;
				while(values.length>i)
				{
					list1.add(values[i]);
					//System.out.println(values[i]);		
					i++;
				}
				System.out.println();
				System.out.println(list1);
				
			}
			buffer.close();
			buffer = new BufferedReader(new FileReader(path2));
			while((readLine = buffer.readLine())!=null)
			{
				System.out.println(readLine);
				String[] values = readLine.split(",");
				int i =0 ;
				while(values.length>i)
				{
					list2.add(values[i]);
					System.out.println(values[i]);
					i++;
				}
				System.out.println();
			}
			buffer.close();	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static long validatePeople(String path1) {
		long lines = 0;
	      try (BufferedReader reader = new BufferedReader(new FileReader(path1))) {
	          while (reader.readLine() != null) lines++;
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	     return lines;		
	}
	*/
}
