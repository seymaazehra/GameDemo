
public class GamerManager {
	public void Add(Gamer gamer) {
    	System.out.println(gamer.firstName+gamer.lastName+" adl� kullan�c� eklendi.");
    }
    public void Delete(Gamer gamer) {
    	System.out.println(gamer.firstName+gamer.lastName+" adl� kullan�c� silindi. ");
    }
    public void Update(Gamer gamer) {
    	System.out.println(gamer.firstName+gamer.lastName+" adl� kullan�c� g�ncellendi. ");
    }
}
