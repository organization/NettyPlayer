/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package be.zvz.nettyplayer;

import be.zvz.nettyplayer.system.NettyAudioSendSystem;
import net.dv8tion.jda.api.audio.factory.IAudioSendFactory;
import net.dv8tion.jda.api.audio.factory.IAudioSendSystem;
import net.dv8tion.jda.api.audio.factory.IPacketProvider;

import javax.annotation.Nonnull;

public class NettyPlayerAudioSendFactory implements IAudioSendFactory {
    @Nonnull
    @Override
    public IAudioSendSystem createSendSystem(@Nonnull IPacketProvider packetProvider) {
        return new NettyAudioSendSystem(packetProvider);
    }
}
