import java.io.IOException;
import org.apache.hive.jdbc.HiveDriver;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Properties;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.text.Normalizer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;


public class GetterRev extends Getter {
    GetterRev() throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {
	super();
    }

    public ResultSet getRevision(int Id) throws SQLException {
	PreparedStatement query = conn.prepareStatement("select * from revision where rev_id = " + Integer.toString(Id));
	ResultSet result = query.executeQuery();
	return(result);
    }

}
