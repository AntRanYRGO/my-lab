package se.yrgo.schedule;

import java.util.List;
import org.json.*;

/**
 * A class implementing the Formatter interface. Formats a List of Assignment
 * to HTML.
 *
 */
public class JsonFormatter implements Formatter {
    @Override
    public String format(List<Assignment> assignments) {

        if (assignments.size() == 0){
            return "[]";
        }
        else{
            JSONArray JSON = new JSONArray();
            for(Assignment assignment : assignments){
                JSON.put(JSONAssignment(assignment));
            }
            return JSON.toString(2);
        }

//        return "[ { \"some-key\": \"some-value\" } ]";


//        StringBuffer html = new StringBuffer("<!DOCTYPE html>\n")
//                .append("<html lang=\"en\">\n")
//                .append("<head><title>Substitutes R Us - Schedule API</title></head>\n")
//                .append("<body>\n")
//                .append("<h1>Schedule</h1>\n");
//        if (assignments.size() == 0) {
//            html.append("<em>No assignments found.</em>");
//        } else {
//            html.append("<table border=\"1\">\n <tr>\n  <th>Teacher</th>\n  <th>date</th>\n  <th>school</th>\n </tr>\n");
//            for (Assignment assignment : assignments) {
//                html.append(" <tr>\n  <td>").append(assignment.teacher()).append("</td>\n")
//                        .append("  <td>").append(assignment.date()).append("</td>\n")
//                        .append("  <td>").append(assignment.school()).append("</td>\n </tr>\n");
//            }
//            html.append("</table>\n");
//        }
//        html.append("</body>\n");
//        html.append("</html>\n");
//        return html.toString();
    }

    private JSONObject JSONAssignment(Assignment assignment){
        // Create a new empty JSONObject called JSONAsssignment
        JSONObject JSONAssignment = new JSONObject();
        // Put the key "date" in that object, and the value from the assignment's date
        JSONAssignment.put("date", assignment.getDate());
        // Create a new empty JSONObject called JSONSubstitute
        JSONObject JSONSubstitute = new JSONObject();
        // Put the key "name" in that object, and the value from the assignment's teacher's name
        JSONSubstitute.put("name", assignment.getTeacher().getName());
        // Put the JSONSubstitute object in the JSONAssignment object with the key "substitute"
        JSONAssignment.put("substitute", JSONSubstitute);
        // Create a new JSONObject called JSONSchool
        JSONObject JSONSchool = new JSONObject();
        // Put the key "school_name" in that object and the value from the assignment's school's name
        JSONSchool.put("school_name", assignment.getSchool().getSchool_name());
        // Put the key "address" in that object and the value from the assignment's school's address
        JSONSchool.put("address", assignment.getSchool().getSchool_name());
        // Put the JSONSchool in the JSONAssignment object with the key "school"
        JSONAssignment.put("school", JSONSchool);
        return JSONAssignment;
    }
}
