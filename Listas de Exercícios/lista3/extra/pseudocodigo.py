import json

string_json = "{'cidade':'Joinville','bairros':'['Floresta','America','Bom Retiro']}"
json_do_exemplo = json.loads(string_json)
print(json_do_exemplo['bairros'])