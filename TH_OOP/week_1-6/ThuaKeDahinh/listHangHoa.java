import java.util.Arrays;
import java.util.Scanner;

public class DSHANGHOA {
   
	
	private HANGHOA ds[];
	private int n=100 ;
	private int sl = 0;
	
	private Scanner nhap = new Scanner(System.in);
	
	public DSHANGHOA(HANGHOA[] ds, int kg) {
		this.ds = ds;
		
	}
	
	public DSHANGHOA() {
		
		ds = new HANGHOA[n];
	}
	
	public DSHANGHOA(DSHANGHOA x) {
		this.ds = x.ds;
		
	}
	
	public void them()
	{
		System.out.println(" DM:1,TP:2");
		int l = nhap.nextInt();
		if(l==1)
		{
			HANGDM dm = new HANGDM();
			dm.nhap();
			ds[sl] = new HANGDM(dm);
			sl++;
		}
		else
		{
			HANGTP tp = new HANGTP();
			tp.nhap();
			ds[sl] = new HANGTP(tp);
			sl++;
		}
	}
	
	

	

	public void xuatDSTheoLoai()
	{
		System.out.println("CHON MAT HANG CAN XUAT RA: (DM:1,TP:2) ");
		int l = nhap.nextInt();
		if(l==1)
		{
			for(int i=0;i<sl;i++)
			{
				if(ds[i] instanceof HANGDM)
				{
					System.out.println(ds[i].toString());
				}
			}
			
		}
		else
		{
			for(int i=0;i<sl;i++)
			{
				if(ds[i] instanceof HANGTP)
				{
					System.out.println(ds[i].toString());
				}
			}
		}
	}
	
}



public class DEMO {
	
	static Scanner nhap = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		DSHANGHOA ds = new DSHANGHOA();
		HANGHOA h;
		int chon;
		do
		{
			System.out.println(" 1 : Thêm mặt hàng");
			System.out.println(" 2 : Xuất mặt hàng");
			System.out.println(" 0 : thoát ");
			chon = nhap.nextInt();
			if(chon==1)
			{
				ds.them();
			}
			if(chon==2)
			{
				ds.xuatDSTheoLoai();
			}
			
		}while(chon!=0);
		
	}
}



