package Builder;

public class Uygulama {

    public static void main(String[] args) {


        //Builder.Dikdortgen dikdortgen1 = new Builder.Dikdortgen(10,12,"mavi",100,20);
        Dikdortgen dikdortgen1 = new Dikdortgen.DikdortgenBuilder(10,12)
                .renk("mavi")
                .koordinat(100,20)
                .build();

        System.out.println(dikdortgen1);

        //Builder.Dikdortgen dikdortgen2 = new Builder.Dikdortgen(10,12,"yeşil");
        Dikdortgen dikdortgen2 = new Dikdortgen.DikdortgenBuilder(100,200)
                .renk("yesil")
                //.koordinat(40,50)
                .build();

        System.out.println(dikdortgen2);

        //Builder.Dikdortgen dikdortgen3 = new Builder.Dikdortgen(10,12,100,20);
        Dikdortgen dikdortgen3 = new Dikdortgen.DikdortgenBuilder(500,600)
                //.renk("mavi")
                .koordinat(300,320)
                .build();

        System.out.println(dikdortgen3);

        //Builder.Dikdortgen dikdortgen4 = new Builder.Dikdortgen(10,12,100,20);
        Dikdortgen dikdortgen4 = new Dikdortgen.DikdortgenBuilder(20,100)
                //.renk("mavi")
                //.koordinat(100,20)
                .build();

        System.out.println(dikdortgen4);
    }
}
