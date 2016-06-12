/* This class represents a jukebox which plays sounds related with magical
 * effects, soundtrack, collisions... For more information, all the kinds of
 * sound are specified at Playlist. */
package sound;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @author Alberto
 * @version 26/03/2016 */
public class Jukebox {
    /**
     * A pool whose threads will play a sound (finite or in a loop). */
    private final ThreadPoolExecutor pool;
    private final ArrayList<Playable> playables;
    private final AtomicBoolean mustWait;

    /**
     * @param listLength - the number of sounds the jukebox will be able to
     * play. */
    public Jukebox(int listLength) {
        pool = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        playables = new ArrayList<>();
        mustWait = new AtomicBoolean(false);
    }

    private synchronized void waitUntilClearIfStopped() {

        while (mustWait.get()) {

            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }

    }

    /**
     * @param sound - the sound identifier.
     * @param finite - if the sound will end or not (played in a loop). */
    public void play(Playlist sound, boolean finite) {
        String path;
        Playable p;

        waitUntilClearIfStopped();

        if (sound != null) {

            switch (sound) {
                case ARROW_HIT:
                    path = "/resources/sound/ArrowHit.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case ARROW_SHOT:
                    path = "/resources/sound/ArrowShot.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case CAUGHT:
                    path = "/resources/sound/Caught.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case FREEZING_SPELL:
                    path = "/resources/sound/FreezingSpell.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case GAME_OVER:
                    path = "/resources/sound/GameOver.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case GUITAR_CONCERT:
                    path = "/resources/sound/GuitarConcertInEMinor.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_1:
                    path = "/resources/sound/Hit1.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_2:
                    path = "/resources/sound/Hit2.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_3:
                    path = "/resources/sound/Hit3.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case JUMP:
                    path = "/resources/sound/Jump.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MAGIC_SMITE:
                    path = "/resources/sound/MagicSmite.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MEMORIES:
                    path = "/resources/sound/MemoriesInDMinor.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MOUSE_ENTERED:
                    path = "/resources/sound/MouseEntered.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case SELECT:
                    path = "/resources/sound/Select.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case SHOT:
                    path = "/resources/sound/Shot.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                
                case STEP:
                    path = "/resources/sound/Step.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                        
                case THE_LURKING_BEAST:
                    path = "/resources/sound/TheLurkingBeast.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                    
                case FALLING_RUBBLE:
                    path = "/resources/sound/FallingRubble.wav";
                    p = new Playable(path, finite, sound);
                    playables.add(p);
                    pool.execute(p);
            }

        }

    }

    /**
     * @param sound - the sound identifier.
     * @param finite - if the sound will end or not (played in a loop).
     * @param decibels - the number of decibels to deduct from the volume. */
    public void play(Playlist sound, boolean finite, float decibels) {
        String path;
        Playable p;

        waitUntilClearIfStopped();

        if (sound != null) {

            switch (sound) {
                case ARROW_HIT:
                    path = "/resources/sound/ArrowHit.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case ARROW_SHOT:
                    path = "/resources/sound/ArrowShot.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case CAUGHT:
                    path = "/resources/sound/Caught.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case FREEZING_SPELL:
                    path = "/resources/sound/FreezingSpell.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case GAME_OVER:
                    path = "/resources/sound/GameOver.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case GUITAR_CONCERT:
                    path = "/resources/sound/GuitarConcertInEMinor.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_1:
                    path = "/resources/sound/Hit1.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_2:
                    path = "/resources/sound/Hit2.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_3:
                    path = "/resources/sound/Hit3.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case JUMP:
                    path = "/resources/sound/Jump.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MAGIC_SMITE:
                    path = "/resources/sound/MagicSmite.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MEMORIES:
                    path = "/resources/sound/MemoriesInDMinor.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MOUSE_ENTERED:
                    path = "/resources/sound/MouseEntered.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case SELECT:
                    path = "/resources/sound/Select.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case SHOT:
                    path = "/resources/sound/Shot.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                    
                case STEP:
                    path = "/resources/sound/Step.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                    
                case THE_LURKING_BEAST:
                    path = "/resources/sound/TheLurkingBeast.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                    
                case FALLING_RUBBLE:
                    path = "/resources/sound/FallingRubble.wav";
                    p = new Playable(path, finite, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
            }

        }

    }

    /**
     * @param sound - the sound identifier.
     * @param start - the starting frame of the clip.
     * @param end - the ending frame of the clip. */
    public void play(Playlist sound, int start, int end) {
        String path;
        Playable p;

        waitUntilClearIfStopped();

        if (sound != null) {

            switch (sound) {
                case ARROW_HIT:
                    path = "/resources/sound/ArrowHit.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case ARROW_SHOT:
                    path = "/resources/sound/ArrowShot.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case CAUGHT:
                    path = "/resources/sound/Caught.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case FREEZING_SPELL:
                    path = "/resources/sound/FreezingSpell.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case GAME_OVER:
                    path = "/resources/sound/GameOver.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case GUITAR_CONCERT:
                    path = "/resources/sound/GuitarConcertInEMinor.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_1:
                    path = "/resources/sound/Hit1.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_2:
                    path = "/resources/sound/Hit2.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_3:
                    path = "/resources/sound/Hit3.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case JUMP:
                    path = "/resources/sound/Jump.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MAGIC_SMITE:
                    path = "/resources/sound/MagicSmite.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MEMORIES:
                    path = "/resources/sound/MemoriesInDMinor.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MOUSE_ENTERED:
                    path = "/resources/sound/MouseEntered.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case SELECT:
                    path = "/resources/sound/Select.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case SHOT:
                    path = "/resources/sound/Shot.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                    
                case STEP:
                    path = "/resources/sound/Step.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                        
                        
                case THE_LURKING_BEAST:
                    path = "/resources/sound/TheLurkingBeast.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                    
                case FALLING_RUBBLE:
                    path = "/resources/sound/FallingRubble.wav";
                    p = new Playable(path, start, end, sound);
                    playables.add(p);
                    pool.execute(p);
            }

        }

    }

    /**
     * @param sound - the sound identifier.
     * @param start - the starting frame of the clip.
     * @param end - the ending frame of the clip.
     * @param decibels - the number of decibels to deduct from the volume. */
    public void play(Playlist sound, int start, int end, float decibels) {
        String path;
        Playable p;

        waitUntilClearIfStopped();

        if (sound != null) {

            switch (sound) {
                case ARROW_HIT:
                    path = "/resources/sound/ArrowHit.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case ARROW_SHOT:
                    path = "/resources/sound/ArrowShot.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case CAUGHT:
                    path = "/resources/sound/Caught.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case FREEZING_SPELL:
                    path = "/resources/sound/FreezingSpell.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case GAME_OVER:
                    path = "/resources/sound/GameOver.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case GUITAR_CONCERT:
                    path = "/resources/sound/GuitarConcertInEMinor.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_1:
                    path = "/resources/sound/Hit1.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_2:
                    path = "/resources/sound/Hit2.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case HIT_3:
                    path = "/resources/sound/Hit3.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case JUMP:
                    path = "/resources/sound/Jump.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MAGIC_SMITE:
                    path = "/resources/sound/MagicSmite.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MEMORIES:
                    path = "/resources/sound/MemoriesInDMinor.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case MOUSE_ENTERED:
                    path = "/resources/sound/MouseEntered.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case SELECT:
                    path = "/resources/sound/Select.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                case SHOT:
                    path = "/resources/sound/Shot.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                    
                case STEP:
                    path = "/resources/sound/Step.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                        
                case THE_LURKING_BEAST:
                    path = "/resources/sound/TheLurkingBeast.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
                    break;
                    
                case FALLING_RUBBLE:
                    path = "/resources/sound/FallingRubble.wav";
                    p = new Playable(path, start, end, decibels, sound);
                    playables.add(p);
                    pool.execute(p);
            }

        }

    }

    /**
     * Awaits until the clips being played would terminate or until the time
     * interval expires.
     * @param time
     * @param timeUnit */
    public void awaitTermination(int time, TimeUnit timeUnit) {

        if (!pool.isTerminated() && !pool.isTerminating()) {

            try {
                pool.awaitTermination(time, timeUnit);
            } catch (InterruptedException exception) {
                System.out.println(exception.getMessage());
            }

        }

    }

    /**
     * Stops all the clips are being played. */
    public synchronized void stop() {
        mustWait.set(true);

        for (Playable p : playables)
            p.stop();

        playables.clear();
        mustWait.set(false);
        notifyAll();
    }
    
    
    /**
     * This method will be called when a playable ends its task, so it can be 
     * removed from the list.
     * 
     * @param playable
     *              Playable that finished its execution.
     */
    public void clipEnded (Playable playable) {
        
        /* Removes the object from the list */
        playables.remove(playable);
    }

    /**
     * Returns <i>true</i> if the given clip is playing.
     * 
     * @param clip 
     *             The clip which name is going to be searched between the
     *          currently playing clips.
     * 
     * @return 
     */
    public boolean isPlaying (Playlist clip) {
        
        for (Playable p : playables) {
            
            if (p.getClipName().equals(clip)) {
             
                return true;
            }
        }
        
        return false;
    }
}
