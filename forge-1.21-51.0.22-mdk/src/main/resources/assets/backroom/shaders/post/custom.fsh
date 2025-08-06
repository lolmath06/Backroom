#version 330 core
in vec2 UV;
in vec4 VertexColor;

uniform sampler2D Texture;
uniform sampler2D NoiseTexture;
uniform float time;
uniform vec2 puddleScale;

out vec4 FragColor;

void main() {
    vec4 baseColor = texture(Texture, UV) * VertexColor;

    vec2 noiseUV = UV * puddleScale + vec2(time * 0.1);
    float noiseFactor = texture(NoiseTexture, noiseUV).r;

    float puddleAlpha = smoothstep(0.4, 0.6, noiseFactor);
    vec4 waterColor = vec4(0.0, 0.3, 0.6, puddleAlpha);

    vec4 finalColor = mix(baseColor, waterColor, waterColor.a);
    FragColor = vec4(1.0 , 0.0, 0.0, 1.0);
}
