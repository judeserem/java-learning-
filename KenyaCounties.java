public class KenyaCounties {
    public static void main(String[] args) {
        String[] counties = {
            "Baringo", "Bomet", "Bungoma", "Busia", "Elgeyo-Marakwet", 
            // "Embu", "Garissa", "Homa Bay", "Isiolo", "Kajiado", '/'60
            "Kakamega", "Kericho", "Kiambu", "Kilifi", "Kirinyaga", 
            "Kisii", "Kisumu", "Kitui", "Kwale", "Laikipia", 
            "Lamu", "Machakos", "Makueni", "Mandera", "Meru", 
            "Migori", "Marsabit", "Mombasa", "Murang'a", "Nairobi", 
            "Nakuru", "Nandi", "Narok", "Nyamira", "Nyandarua", 
            "Nyeri", "Samburu", "Siaya", "Taita-Taveta", "Tana River", 
            "Tharaka-Nithi", "Trans Nzoia", "Turkana", "Uasin Gishu", "Vihiga", 
            "Wajir", "West Pokot"
        };

        for (String county : counties) {
            System.out.println(county);
        }
    }
}
