package com.packtpub.libgdx.canyonbunny.screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.packtpub.libgdx.canyonbunny.util.Constants;

/**
 * Created by sargis on 8/13/14.
 */
public class MenuScreen extends AbstractGameScreen {
    // debug
    private final float DEBUG_REBUILD_INTERVAL = 5.0f;
    private Stage stage;
    private Skin skinCanyonBunny;
    // menu
    private Image imgBackground;
    private Image imgLogo;
    private Image imgInfo;
    private Image imgCoins;
    private Image imgBunny;
    private Button btnMenuPlay;
    private Button btnMenuOptions;
    // options
    private Window winOptions;
    private TextButton btnWinOptSave;
    private TextButton btnWinOptCancel;
    private CheckBox chkSound;
    private Slider sldSound;
    private CheckBox chkMusic;
    private Slider sldMusic;
    private SelectBox selCharSkin;
    private Image imgCharSkin;
    private CheckBox chkShowFpsCounter;
    private boolean debugEnabled = false;
    private float debugRebuildStage;

    public MenuScreen(Game game) {
        super(game);
    }

    @Override
    public void render(float deltaTime) {
        Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        if (Gdx.input.isTouched())
            game.setScreen(new GameScreen(game));
    }

    @Override
    public void resize(int width, int height) {
        stage.setViewport(new ScreenViewport());
    }

    @Override
    public void show() {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        rebuildStage();
    }

    @Override
    public void hide() {
        stage.dispose();
        skinCanyonBunny.dispose();
    }

    @Override
    public void pause() {
    }

    private void rebuildStage() {
        skinCanyonBunny = new Skin(
                Gdx.files.internal(Constants.SKIN_CANYONBUNNY_UI),
                new TextureAtlas(Constants.TEXTURE_ATLAS_UI));
        // build all layers
        Table layerBackground = buildBackgroundLayer();
        Table layerObjects = buildObjectsLayer();
        Table layerLogos = buildLogosLayer();
        Table layerControls = buildControlsLayer();
        Table layerOptionsWindow = buildOptionsWindowLayer();
        // assemble stage for menu screen
        stage.clear();
        Stack stack = new Stack();
        stage.addActor(stack);
        stack.setSize(Constants.VIEWPORT_GUI_WIDTH,
                Constants.VIEWPORT_GUI_HEIGHT);
        stack.add(layerBackground);
        stack.add(layerObjects);
        stack.add(layerLogos);
        stack.add(layerControls);
        stage.addActor(layerOptionsWindow);
    }

    private Table buildBackgroundLayer() {
        Table layer = new Table();
        return layer;
    }

    private Table buildObjectsLayer() {
        Table layer = new Table();
        return layer;
    }

    private Table buildLogosLayer() {
        Table layer = new Table();
        return layer;
    }

    private Table buildControlsLayer() {
        Table layer = new Table();
        return layer;
    }

    private Table buildOptionsWindowLayer() {
        Table layer = new Table();
        return layer;
    }
}
