using System.Collections;
using System.Collections.Generic;
using Unity.Profiling;
using UnityEngine;
using UnityEngine.UI;

public class GameTimer : MonoBehaviour
{
    [Tooltip("Our level timemr in SECONDS")]
    [SerializeField] float levelTime = 10f;
    bool timerFinished;
    bool triggeredLevelFinished;

    // Update is called once per frame
    void Update()
    {
        if (triggeredLevelFinished) { return; }
        
        GetComponent<Slider>().value = Time.timeSinceLevelLoad/levelTime;

        timerFinished = (Time.timeSinceLevelLoad >= levelTime);
        if (timerFinished)
        {
            FindObjectOfType<LevelController>().LevelTimerFinished();
            triggeredLevelFinished = true;

        }

    }

}
