package helio.action.odrl;

import helio.blueprints.exceptions.ActionException;

public class Test {


	public static String data = "{\n"
			+ "  \"@context\": \"http://www.w3.org/ns/odrl.jsonld\",\n"
			+ "  \"@type\": \"Set\",\n"
			+ "  \"uid\": \"http://example.com/policy:1010\",\n"
			+ "  \"permission\": [\n"
			+ "    {\n"
			+ "      \"target\": \"http://example.com/asset:9898.movie\",\n"
			+ "      \"action\": \"display\",\n"
			+ "      \"constraint\": [\n"
			+ "        {\n"
			+ "          \"leftOperand\": \"http://upm.es/operands#time\",\n"
			+ "          \"operator\": \"gt\",\n"
			+ "          \"rightOperand\": {\n"
			+ "            \"@value\": \"06:00:13.62\",\n"
			+ "            \"@type\": \"xsd:time\"\n"
			+ "          }\n"
			+ "        }\n"
			+ "      ]\n"
			+ "    }\n"
			+ "  ]\n"
			+ "}";
	
	public static void main(String[] args) throws ActionException {
		ODRL odrl = new ODRL();
		System.out.println(odrl.run(data));
	}
}
