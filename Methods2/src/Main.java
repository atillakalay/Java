
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel";
		String yeniMesaj = mesaj.substring(0, 2);
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7, 8, 9, 76);
		System.out.println(sayi);

	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("G�ncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static String sehirVer() {
		return "�stanbul";
	}

	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam = toplam + sayi;
		}
		return toplam;
	}
}
