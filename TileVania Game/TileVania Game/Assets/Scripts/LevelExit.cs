using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.SceneManagement;

public class LevelExit : MonoBehaviour
{
    [SerializeField] float levelLoadDelay = 2f;
    [SerializeField] float levelExitSloMoFactor = 0.5f;
    
    private void OnTriggerEnter2D(Collider2D other)
    {
        StartCoroutine(LoadNextLevel());
    }

    IEnumerator LoadNextLevel()
    {
        int currentSceneIndex = SceneManager.GetActiveScene().buildIndex;
        Time.timeScale = levelExitSloMoFactor;
        yield return new WaitForSecondsRealtime(levelLoadDelay);
        Time.timeScale = 1f;
        
        

        SceneManager.LoadScene(currentSceneIndex+1);
       
    }
}
