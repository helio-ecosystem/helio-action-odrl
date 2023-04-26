package helio.action.odrl;

import com.google.gson.JsonObject;

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

	public static String data2 ="{\n"
			+ " \"@context\": [\"http://www.w3.org/ns/odrl.jsonld\",\n"
			+ "   {\"geof\" : \"http://www.opengis.net/def/function/geosparql/\"}\n"
			+ " ],\n"
			+ " \"@type\": \"Set\",\n"
			+ " \"uid\": \"http://example.com/policy:1010\",\n"
			+ " \"permission\": [{\n"
			+ " 	\"target\": \"http://example.com/asset:9898.movie\",\n"
			+ "	\"action\": \"read\",\n"
			+ "	\"constraint\":{\n"
			+ "          \"leftOperand\":  { \"@value\": \"POLYGON((-3.840070031583308 40.405675773960866,-3.839853107929229 40.40574011056009,-3.839842379093169 40.40571994155346,-3.839847072958945 40.40571840972993,-3.839840702712535 40.405706155140365,-3.840056620538234 40.40564947763477,-3.840070031583308 40.405675773960866))\", \"@type\": \"http://www.opengis.net/ont/geosparql#wktLiteral\" },\n"
			+ "          \"operator\": \"geof:sfContains\" ,\n"
			+ "          \"rightOperand\": { \"@value\": \"POINT((-3.839907742614103 40.40570902334372))\", \"@type\": \"http://www.opengis.net/ont/geosparql#wktLiteral\" }\n"
			+ "	   }\n"
			+ " }]\n"
			+ "}\n"
			+ "";

	public static void main(String[] args) throws ActionException {
		ODRL odrl = new ODRL();
	
		JsonObject conf = new JsonObject();
		//conf.addProperty("geof", "http://www.opengis.net/def/function/geosparql/");
		//odrl.configure(conf);
		System.out.println(odrl.run(data2));
	}
}
