package bridge.view;

import bridge.model.BridgeGameResult;

/**
 * 사용자에게 게임 진행 상황과 결과를 출력하는 역할을 한다.
 */
public class OutputView {

    public final static String GAME_START_MESSAGE = "다리 건너기 게임을 시작합니다.\n";
    public final static String READ_BRIDGE_SIZE_MESSAGE = "다리의 길이를 입력해주세요.";
    public final static String READ_MOVING_MESSAGE = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
    public final static String FINAL_GAME_RESULT_MESSAGE = "최종 게임 결과";
    public final static String READ_RETRY_MESSAGE = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)";
    public final static String PLAYER_CLEARED_MESSAGE = "게임 성공 여부: ";
    public final static String PLAYER_TRIED_MESSAGE = "총 시도한 횟수: ";

    private void printlnMessage(String message) {

        System.out.println(message);
    }

    private void printMessage(String message) {

        System.out.print(message);
    }

    public void printStart() {

        printlnMessage(GAME_START_MESSAGE);
    }

    public void printReadBridgeSize() {

        printlnMessage(READ_BRIDGE_SIZE_MESSAGE);
    }

    public void printReadMoving() {

        printlnMessage(READ_MOVING_MESSAGE);
    }

    public void printReadRetry() {

        printlnMessage(READ_RETRY_MESSAGE);
    }

    /**
     * 현재까지 이동한 다리의 상태를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printMap() {
    }


    public void printPlayerCleared(String cleared) {
        printMessage(PLAYER_CLEARED_MESSAGE);
        printlnMessage(cleared);
    }

    public void printPlayerTried(int tried) {
        printMessage(PLAYER_TRIED_MESSAGE);
        printlnMessage(String.valueOf(tried));
    }

    /**
     * 게임의 최종 결과를 정해진 형식에 맞춰 출력한다.
     * <p>
     * 출력을 위해 필요한 메서드의 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void printResult(BridgeGameResult bridgeGameResult) {
        printlnMessage(FINAL_GAME_RESULT_MESSAGE);
        printPlayerCleared(bridgeGameResult.getCleared());
        printPlayerTried(bridgeGameResult.getTried());
    }
}
