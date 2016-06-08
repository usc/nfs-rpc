package code.google.nfs.rpc.netty4.benchmark;

/**
 * nfs-rpc
 *   Apache License
 *
 *   http://code.google.com/p/nfs-rpc (c) 2011
 */
import code.google.nfs.rpc.benchmark.AbstractSimpleProcessorBenchmarkClient;
import code.google.nfs.rpc.client.ClientFactory;
import code.google.nfs.rpc.netty4.client.Netty4ClientFactory;

/**
 * Netty4 Direct Call RPC Benchmark Client
 *
 * @author <a href="mailto:coderplay@gmail.com">Min Zhou</a>
 */
public class Netty4SimpleBenchmarkClient extends AbstractSimpleProcessorBenchmarkClient {

    public static void main(String[] args) throws Exception {
        args = new String[] { "127.0.0.1", "9527", "100", "1000", "1", "100", "60", "1" };
        new Netty4SimpleBenchmarkClient().run(args);
    }

    public ClientFactory getClientFactory() {
        return Netty4ClientFactory.getInstance();
    }

}
