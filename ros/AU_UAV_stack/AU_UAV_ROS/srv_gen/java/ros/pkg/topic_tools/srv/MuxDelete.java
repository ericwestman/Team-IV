/* Auto-generated by genmsg_cpp for file /opt/ros/electric/stacks/ros_comm/tools/topic_tools/srv/MuxDelete.srv */

package ros.pkg.topic_tools.srv;

import java.nio.ByteBuffer;


public class MuxDelete extends ros.communication.Service<MuxDelete.Request, MuxDelete.Response> {

  public static java.lang.String __s_getDataType() { return "topic_tools/MuxDelete"; }
  public static java.lang.String __s_getMD5Sum() { return "d8f94bae31b356b24d0427f80426d0c3"; }

  public java.lang.String getDataType() { return MuxDelete.__s_getDataType(); }
  public java.lang.String getMD5Sum() { return MuxDelete.__s_getMD5Sum(); }

  public MuxDelete.Request createRequest() {
    return new MuxDelete.Request();
  }

  public MuxDelete.Response createResponse() {
    return new MuxDelete.Response();
  }

static public class Request extends ros.communication.Message {

  public java.lang.String topic = new java.lang.String();

  public Request() {
  }

  public static java.lang.String __s_getDataType() { return "topic_tools/MuxDeleteRequest"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "d8f94bae31b356b24d0427f80426d0c3"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "d8f94bae31b356b24d0427f80426d0c3"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "string topic\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Request clone() {
    Request c = new Request();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    __l += 4 + topic.length();
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
    Serialization.writeString(bb, topic);
  }

  public void deserialize(ByteBuffer bb) {
    topic = Serialization.readString(bb);
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Request))
      return false;
    Request other = (Request) o;
    return
      topic.equals(other.topic) &&
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    result = prime * result + (this.topic == null ? 0 : this.topic.hashCode());
    return result;
  }
} // class Request

static public class Response extends ros.communication.Message {


  public Response() {
  }

  public static java.lang.String __s_getDataType() { return "topic_tools/MuxDeleteResponse"; }
  public java.lang.String getDataType() { return __s_getDataType(); }
  public static java.lang.String __s_getMD5Sum() { return "d41d8cd98f00b204e9800998ecf8427e"; }
  public java.lang.String getMD5Sum() { return __s_getMD5Sum(); }
  public static java.lang.String __s_getServerMD5Sum() { return "d8f94bae31b356b24d0427f80426d0c3"; }
  public java.lang.String getServerMD5Sum() { return __s_getServerMD5Sum(); }
  public static java.lang.String __s_getMessageDefinition() { return "\n" +
"\n" +
"\n" +
""; }
  public java.lang.String getMessageDefinition() { return __s_getMessageDefinition(); }

  public Response clone() {
    Response c = new Response();
    c.deserialize(serialize(0));
    return c;
  }

  public void setTo(ros.communication.Message m) {
    deserialize(m.serialize(0));
  }

  public int serializationLength() {
    int __l = 0;
    return __l;
  }

  public void serialize(ByteBuffer bb, int seq) {
  }

  public void deserialize(ByteBuffer bb) {
  }

  @SuppressWarnings("all")
  public boolean equals(Object o) {
    if(!(o instanceof Response))
      return false;
    Response other = (Response) o;
    return
      true;
  }

  @SuppressWarnings("all")
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    long tmp;
    return result;
  }
} // class Response

} //class

