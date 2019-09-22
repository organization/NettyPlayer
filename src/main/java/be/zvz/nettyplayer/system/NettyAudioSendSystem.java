package be.zvz.nettyplayer.system;

import net.dv8tion.jda.api.audio.factory.IAudioSendSystem;
import net.dv8tion.jda.api.audio.factory.IPacketProvider;

import javax.annotation.Nonnull;

public class NettyAudioSendSystem implements IAudioSendSystem {
    @Nonnull private final IPacketProvider packetProvider;

    public NettyAudioSendSystem(@Nonnull IPacketProvider packetProvider) {
        this.packetProvider = packetProvider;
    }

    @Override
    public void start() {

    }

    @Override
    public void shutdown() {

    }
}
