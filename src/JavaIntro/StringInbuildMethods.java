package JavaIntro;

public class StringInbuildMethods {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = " Hello Manikandan! today you have a great day ";
		String str1 = "Hey";
		String str2 = " ";
		String str3 = "Hey, I love You ";
		System.out.println("String lenghth " + str.length());
		System.out.println("String charcter at index " + str.charAt(18));
		System.out.println("adding sttring so on " + str.concat(" and " + str3));
		System.out.println("String contains " + str3.contains("loving"));
		System.out.println("String starts with " + str.startsWith("Hello"));
		System.out.println("Strring ends with " + str.endsWith(" "));
		System.out.println("String equals " + str1.equals(str2));
		System.out.println("String equals ignore sensitive case" + str1.equalsIgnoreCase(str2));
		System.out.println("String index of " + str.indexOf("Manikandan"));
        System.out.println("check if string is empty " + str3.isEmpty());
        System.out.println("check if string is blank " + str2.isBlank());
        System.out.println("String replacing old char to new char " + str.replace("Manikandan", "Kumaran"));
		System.out.println("Sring substring: return part of a string " + str.substring(15, 20));
		System.out.println("String lowercase " + str.toLowerCase());
		System.out.println("String Uppercase " + str.toUpperCase());
		System.out.println("String Trim " + str.trim());

	}

}
