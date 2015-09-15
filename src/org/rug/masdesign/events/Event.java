package org.rug.masdesign.events;

import org.rug.masdesign.agents.Agent;

import java.util.List;

/**
 * Created by wizzardich on 9/15/15.
 */
public abstract class Event {
    protected List<Agent> participants;
    protected List<Agent> observers;
    protected boolean legacy = false;

    public List<Agent> getParticipants() {
        return participants;
    }

    public List<Agent> getObservers() {
        return observers;
    }

    public boolean isLegacy() {
        return legacy;
    }

    public void setLegacy() {
        legacy = true;
    }

    public abstract EventType getEventType();
    public abstract void apply(List<Agent> participants, List<Agent> observers);
}