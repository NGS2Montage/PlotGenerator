package edu.vt.bi.ndssl.ngs2.intersim;

import java.util.TreeMap;

/**
 * Saliya Ekanayake on 3/16/17.
 */
public class IntersimData {
    private TreeMap<Integer, TreeMap<Integer, TreeMap<Integer, int[]>>> iterToTimeStampToNodeIdToStates;
    private TreeMap<Integer, IntersimAgent> nodeIdToIntersimAgent;

    public IntersimData(TreeMap<Integer, TreeMap<Integer, TreeMap<Integer, int[]>>> iterToTimeStampToNodeIdToStates,
                        TreeMap<Integer, IntersimAgent> nodeIdToIntersimAgent) {
        this.iterToTimeStampToNodeIdToStates = iterToTimeStampToNodeIdToStates;
        this.nodeIdToIntersimAgent = nodeIdToIntersimAgent;
    }

    public TreeMap<Integer, TreeMap<Integer, TreeMap<Integer, int[]>>> getIterToTimeStampToNodeIdToStates() {
        return iterToTimeStampToNodeIdToStates;
    }

    public TreeMap<Integer, IntersimAgent> getNodeIdToIntersimAgent() {
        return nodeIdToIntersimAgent;
    }
}

