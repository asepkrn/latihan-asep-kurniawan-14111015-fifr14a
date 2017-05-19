public class TReptil{
	
	public void tampilkan(){
		Reptil pgl = new Reptil();
        pgl.setmakanan("nyamuk");        
		pgl.setnama("cicak");
        System.out.println("makanan reptil = "+ pgl.getmakanan());
		System.out.println("nama reptil    = "+ pgl.getnama());
	}
	
}