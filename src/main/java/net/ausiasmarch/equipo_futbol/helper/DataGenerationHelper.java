package net.ausiasmarch.equipo_futbol.helper;

import java.util.concurrent.ThreadLocalRandom;
import java.time.LocalDate;

public class DataGenerationHelper {

    private static final String[] aPlayerNames = {
            "Lionel", "Cristiano", "Neymar", "Kylian", "Mohamed",
            "Robert", "Sergio", "Kevin", "Luka", "Virgil",
            "Harry", "Erling", "Karim", "Marco", "Antoine", "Paul"
    };

    private static final String[] aCuerpoTecnicoNames = {
            "José", "Pep", "Jürgen", "Zinedine", "Diego",
            "Mauricio", "Ernesto", "Carlo", "Ole", "Thomas",
            "Marcelo", "Antonio", "Rafa", "Simone", "Lucien", "Roberto"
    };

    private static final String[] aPlayerSurnames = {
            "Messi", "Ronaldo", "Neymar", "Mbappé", "Salah",
            "Lewandowski", "Ramos", "De Bruyne", "Modrić", "Van Dijk",
            "Kane", "Haaland", "Benzema", "Reus", "Griezmann", "Pogba"
    };

    private static final String[] aCuerpoTecnicoSurnames = {
            "García", "Mourinho", "Klopp", "Zidane", "Simeone",
            "Pochettino", "Valverde", "Ancelotti", "Solskjær", "Tuchel",
            "Bielsa", "Conte", "Benítez", "Inzaghi", "Favre", "Martínez"
    };

    private static final String[] aCuerpoTecnicoTitles = {
            "Entrenador", "Asistente Técnico", "Preparador Físico", "Fisioterapeuta", "Analista Táctico",
            "Médico Deportivo", "Psicólogo Deportivo", "Nutricionista", "Entrenador de Porteros", "Scout",
            "Fisioterapeuta Deportivo", "Kinesiólogo", "Psicoterapeuta", "Nutricionista Deportivo",
            "Entrenador de Juveniles", "Especialista en Rehabilitación"
    };

    private static final String[] aPlayerPositions = {
            "DEL", "SD", "EI", "ED", "MI", "MD",
            "CM", "CAM", "CDM", "DFC", "LD", "LI", "CAD", "CAI", "POR"
    };

    private static final String[] oEquipoNames = {
            "Real Madrid", "FC Barcelona", "Manchester United", "Liverpool FC", "Bayern Munich",
            "Paris Saint-Germain", "Chelsea FC", "Manchester City", "Juventus", "AC Milan",
            "Borussia Dortmund", "Arsenal FC", "Tottenham Hotspur", "Inter Milan", "Atletico Madrid", "Ajax Amsterdam"
    };

    private static final String[] aCountries = {
            "España", "Francia", "Italia", "Alemania", "Reino Unido",
            "Portugal", "Grecia", "Suecia", "Países Bajos", "Bélgica",
            "Suiza", "Austria", "Polonia", "Rusia", "Croacia", "Turquía",
            "México", "Argentina", "Brasil", "Chile",
            "Canadá", "Estados Unidos", "Australia", "Nueva Zelanda", "China",
            "Japón", "Corea del Sur", "India", "Sudáfrica", "Egipto",
            "Marruecos", "Túnez", "Argelia", "Nigeria", "Kenia"
    };

    private static final String[] aCities = {
            "Madrid", "Barcelona", "Valencia", "Seville", "Zaragoza",
            "Málaga", "Murcia", "Palma de Mallorca", "Las Palmas de Gran Canaria", "Bilbao",
            "Alicante", "Córdoba", "Valladolid", "Vigo", "Gijón", "Hospitalet de Llobregat",
            "Vitoria-Gasteiz", "Badalona", "Cartagena", "Tarragona",
            "Terrassa", "Sabadell", "Jerez de la Frontera", "Elche", "Getafe", "Alcalá de Henares",
            "San Cristóbal de La Laguna", "Castellón de la Plana", "Santander", "Leganes",
            "Alcorcón", "San Sebastian", "Parla", "Cornellà de Llobregat", "Toledo", "Burgos"
    };

    public static LocalDate getRandomDate() {
        long minDay = LocalDate.of(1970, 1, 1).toEpochDay();
        long maxDay = LocalDate.now().toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);

        return LocalDate.ofEpochDay(randomDay);
    }

    private static final String[] aStadiumNames = {
            "Camp Nou", "Santiago Bernabéu", "Old Trafford", "Anfield", "Allianz Arena",
            "San Siro", "Emirates Stadium", "Etihad Stadium", "Wembley Stadium", "Stamford Bridge",
            "Parc des Princes", "Signal Iduna Park", "Giuseppe Meazza", "Estadio Azteca", "Maracanã", "Stadio Olimpico"
    };

    private static final String[] aLeagueNames = {
            "La Liga", "Premier League", "Bundesliga", "Serie A", "Ligue 1",
            "Eredivisie", "Primeira Liga", "MLS", "Brasileirão", "Argentine Primera División",
            "Scottish Premiership", "J1 League", "Russian Premier League", "Major League Soccer", "Turkish Süper Lig",
            "Liga MX"
    };

    public static String getRadomPlayerName() {
        return aPlayerNames[(int) (Math.random() * aPlayerNames.length)];
    }

    public static String getRadomPlayerSurname() {
        return aPlayerSurnames[(int) (Math.random() * aPlayerSurnames.length)];
    }

    public static String getRadomCuerpoTecnicoName() {
        return aCuerpoTecnicoNames[(int) (Math.random() * aCuerpoTecnicoNames.length)];
    }

    public static String getRadomRadomCuerpoTecnicoSurname() {
        return aCuerpoTecnicoSurnames[(int) (Math.random() * aCuerpoTecnicoSurnames.length)];
    }

    public static String getRadomRadomCuerpoTecnicoTitle() {
        return aCuerpoTecnicoTitles[(int) (Math.random() * aCuerpoTecnicoTitles.length)];
    }

    public static String getRadomPlayerPosition() {
        return aPlayerPositions[(int) (Math.random() * aPlayerPositions.length)];
    }

    public static String getRadomCountry() {
        return aCountries[(int) (Math.random() * aCountries.length)];
    }

    public static String getRadomTeamName() {
        return oEquipoNames[(int) (Math.random() * oEquipoNames.length)];
    }

    public static String getRadomCity() {
        return aCities[(int) (Math.random() * aCities.length)];
    }

    public static String getRandomStadium() {
        return aStadiumNames[(int) (Math.random() * aStadiumNames.length)];
    }

    public static String getRandomLeague() {
        return aLeagueNames[(int) (Math.random() * aLeagueNames.length)];
    }

    public static String doNormalizeString(String cadena) {
        String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
        String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
        String cadenaSinAcentos = cadena;
        for (int i = 0; i < original.length(); i++) {
            cadenaSinAcentos = cadenaSinAcentos.replace(original.charAt(i), ascii.charAt(i));
        }
        return cadenaSinAcentos;
    }

}