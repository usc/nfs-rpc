package code.google.nfs.rpc.netty4.serialize;

import code.google.nfs.rpc.protocol.ProtocolUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * nfs-rpc
 *   Apache License
 *
 *   http://code.google.com/p/nfs-rpc (c) 2011
 */
/**
 * Encode Message
 *
 * @author <a href="mailto:coderplay@gmail.com">Min Zhou</a>
 */
public class Netty4ProtocolEncoder extends MessageToByteEncoder<Object> {
    @Override
    protected void encode(ChannelHandlerContext ctx, Object msg, ByteBuf out) throws Exception {
        // if(msg instanceof ResponseWrapper) {
        // ResponseWrapper r = (ResponseWrapper) msg;
        // LOGGER.info("request id: " + r.getRequestId() + "\t len: " + r.getMessageLen() + "\t type: " + r.getCodecType()) ;
        // }
        Netty4ByteBufferWrapper byteBufferWrapper = new Netty4ByteBufferWrapper(out);
        ProtocolUtils.encode(msg, byteBufferWrapper);
    }

}
